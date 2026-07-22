import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Course } from '../../models/course.model';

@Component({
    selector: 'app-course-card',
    standalone: true,
    imports: [CommonModule],
    template: `
        <div style="border: 1px solid #ccc; padding: 10px; margin: 10px; border-radius: 5px;" 
             [ngStyle]="{'border-left': '5px solid ' + (course.gradeStatus === 'passed' ? 'green' : 'gray')}">
            <h3>{{ course.name }} ({{ course.code }})</h3>
            <p>Credits: {{ course.credits }}</p>
            <button (click)="enrollRequested.emit(course.id)">Enroll</button>
        </div>
    `
})
export class CourseCardComponent {
    @Input() course!: Course;
    @Output() enrollRequested = new EventEmitter<number>();
}