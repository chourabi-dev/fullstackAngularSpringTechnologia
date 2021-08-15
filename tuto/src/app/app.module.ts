import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DeletewhitespacePipe } from './deletewhitespace.pipe';
import { HideemailPipe } from './hideemail.pipe';
import { NavbarComponent } from './navbar/navbar.component';
import { BlocArticlesComponent } from './bloc-articles/bloc-articles.component';
import { ArticlePreviewComponent } from './article-preview/article-preview.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { NotFoundRouteComponent } from './not-found-route/not-found-route.component';
import { ArticleMoreDetailsComponent } from './article-more-details/article-more-details.component';
import { DiscoverUsComponent } from './discover-us/discover-us.component';
import { OurServicesComponent } from './our-services/our-services.component';
import { MemosComponent } from './memos/memos.component';
import { AddMemosComponent } from './add-memos/add-memos.component';
import { NewtypesComponent } from './newtypes/newtypes.component';

@NgModule({
  declarations: [
    AppComponent,
    DeletewhitespacePipe,
    HideemailPipe,
    NavbarComponent,
    BlocArticlesComponent,
    ArticlePreviewComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    NotFoundRouteComponent,
    ArticleMoreDetailsComponent,
    DiscoverUsComponent,
    OurServicesComponent,
    MemosComponent,
    AddMemosComponent,
    NewtypesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, ReactiveFormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
