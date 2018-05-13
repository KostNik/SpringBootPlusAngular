import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {TasksComponent} from './tasks/tasks.component';
import {TaskService} from './tasks/task.service';
import {TasksAddComponent} from './tasks/tasks-add/tasks-add.component';
import {TasksListComponent} from './tasks/tasks-list/tasks-list.component';
import {HttpClientModule} from "@angular/common/http";

@NgModule({
    declarations: [
        AppComponent,
        TasksComponent,
        TasksAddComponent,
        TasksListComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule
    ],
    providers: [TaskService],
    bootstrap: [AppComponent]
})
export class AppModule {
}