import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './components/header/header';

@Component({
    selector: 'app-root',
    standalone: true,
    imports: [RouterOutlet, HeaderComponent],
    template: `
        <app-header></app-header>
        <div style="padding: 20px;">
            <router-outlet></router-outlet>
        </div>
    `
})
export class AppComponent {}