package com.nguyenhoangthanhan.pokemonapp.di

import com.nguyenhoangthanhan.pokemonapp.data.remote.PokeAPI
import com.nguyenhoangthanhan.pokemonapp.repository.PokemonRepository
import com.nguyenhoangthanhan.pokemonapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeAPI
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokeApi(): PokeAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(PokeAPI::class.java)
    }
}