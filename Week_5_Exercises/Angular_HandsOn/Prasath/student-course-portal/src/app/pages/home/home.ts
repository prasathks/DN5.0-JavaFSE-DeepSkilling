import { Component, OnInit, OnDestroy } from '@angular/core';
import { CourseService } from '../../services/course.service';

@Component({
    selector: 'app-home',
    standalone: true,
    template: `
        <div>
            <h1>{{ portalName }}</h1>
            <p>Welcome to the dashboard.</p>
            <p>Courses Available: {{ courseCount }}</p>
        </div>
    `
})
export class HomeComponent implements OnInit, OnDestroy {
    portalName = 'Student Course Portal';
    courseCount = 0;
    
    constructor(private courseService: CourseService) {}

    ngOnInit() {
        this.courseService.getCourses().subscribe(c => this.courseCount = c.length);
        console.log('HomeComponent initialised');
    }
    ngOnDestroy() { console.log('HomeComponent destroyed'); }
}