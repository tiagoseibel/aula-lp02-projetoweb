import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BlocoComponent } from './bloco/bloco.component';
import { HomeComponent } from './home/home.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';

import { Roteador } from './app.router';

@NgModule({
  declarations: [
    AppComponent,
    BlocoComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule, Roteador, HttpModule, FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
