import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
    selector: 'app-header',
    standalone: true,
    imports: [RouterLink],
    template: `
        <nav style="padding: 1rem; background: #eee;">
            <h2>Student Course Portal</h2>
            <a routerLink="/">Home</a> | 
            <a routerLink="/courses">Courses</a> | 
            <a routerLink="/enroll">Enroll</a>
        </nav>
    `
})
export class HeaderComponent {}