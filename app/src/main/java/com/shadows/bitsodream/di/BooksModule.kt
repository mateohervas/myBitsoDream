package com.shadows.bitsodream.di

import com.shadows.bitsodream.MyApplication
import com.shadows.bitsodream.data.local.BookRoomDatabase
import com.shadows.bitsodream.data.local.dao.BooksDAO
import com.shadows.bitsodream.data.remote.MyBitsoDataSource
import com.shadows.bitsodream.domain.repository.BooksRepository
import com.shadows.bitsodream.ui.books.BooksViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@ExperimentalCoroutinesApi
val booksModule = module{
    single<MyBitsoDataSource>{ MyBitsoDataSource.create()}


    single<BooksRepository> { BooksRepository(get()) }
    viewModel { BooksViewModel(get()) }
}