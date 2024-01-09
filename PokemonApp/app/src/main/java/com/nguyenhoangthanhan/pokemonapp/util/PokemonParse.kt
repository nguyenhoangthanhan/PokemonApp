package com.nguyenhoangthanhan.pokemonapp.util

import androidx.compose.ui.graphics.Color
import com.nguyenhoangthanhan.pokemonapp.data.remote.responses.Stat
import com.nguyenhoangthanhan.pokemonapp.data.remote.responses.Type
import com.nguyenhoangthanhan.pokemonapp.ui.theme.AtkColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.DefColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.HPColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.SpAtkColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.SpDefColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.SpdColor
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeBug
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeDark
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeDragon
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeElectric
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeFairy
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeFighting
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeFire
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeFlying
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeGhost
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeGrass
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeGround
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeIce
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeNormal
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypePoison
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypePsychic
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeRock
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeSteel
import com.nguyenhoangthanhan.pokemonapp.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(
    type: Type
): Color {
    return when (type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "Rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "Dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when (stat.stat.name.lowercase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when (stat.stat.name.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}