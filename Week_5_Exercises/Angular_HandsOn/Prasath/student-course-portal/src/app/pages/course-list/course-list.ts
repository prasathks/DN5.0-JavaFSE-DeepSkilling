import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseService } from '../../services/course.service';
import { CourseCardComponent } from '../../components/course-card/course-card';
import { Course } from '../../models/course.model';

@Component({
    selector: 'app-course-list',
    standalone: true,
    imports: [CommonModule, CourseCardComponent],
    template: `
        <div>
            <h2>Course Listing</h2>
            <div *ngIf="isLoading; else courseGrid">Loading courses...</div>
            <ng-template #courseGrid>
                <app-course-card *ngFor="let c of courses; trackBy: trackByCourseId" 
                               [course]="c" (enrollRequested)="onEnroll($event)">
                </app-course-card>
            </ng-template>
            <p *ngIf="selectedCourseId">Selected course ID: {{ selectedCourseId }}</p>
        </div>
    `
})
export class CourseListComponent implements OnInit {
    courses: Course[] = [];
    isLoading = true;
    selectedCourseId?: number;

    constructor(private courseService: CourseService) {}

    ngOnInit() {
        this.courseService.getCourses().subscribe(data => {
            this.courses = data;
            setTimeout(() => this.isLoading = false, 1500);
        });
    }

    onEnroll(id: number) { this.selectedCourseId = id; }
    trackByCourseId(index: number, course: Course) { return course.id; }
}