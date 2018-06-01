import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BlocoComponent } from './bloco/bloco.component';
import { HomeComponent } from './home/home.component';
import { Roteador } from './app.router';

@NgModule({
  declarations: [
    AppComponent,
    BlocoComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule, Roteador
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
