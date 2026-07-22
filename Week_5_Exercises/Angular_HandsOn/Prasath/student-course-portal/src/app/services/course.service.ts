import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Course } from '../models/course.model';
import { map, catchError, tap, retry } from 'rxjs/operators';

@Injectable({ providedIn: 'root' })
export class CourseService {
    constructor(private http: HttpClient) {}
    
    getCourses(): Observable<Course[]> {
        // Return dummy data since JSON server isn't running
        const dummy: Course[] = [
            { id: 1, name: 'Angular Basics', code: 'CS101', credits: 3, gradeStatus: 'passed' },
            { id: 2, name: 'NgRx State', code: 'CS102', credits: 4, gradeStatus: 'pending' }
        ];
        return of(dummy);
    }
}