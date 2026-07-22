import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-enrollment-form',
    standalone: true,
    imports: [FormsModule, CommonModule],
    template: `
        <form #enrollForm="ngForm" (ngSubmit)="onSubmit(enrollForm)">
            <input type="text" name="studentName" ngModel required minlength="3" #nameCtrl="ngModel" placeholder="Student Name">
            <span *ngIf="nameCtrl.touched && nameCtrl.errors?.['required']" style="color:red">Name required</span>
            <button type="submit" [disabled]="enrollForm.invalid">Submit</button>
        </form>
    `
})
export class EnrollmentFormComponent {
    onSubmit(form: NgForm) { console.log(form.value); }
}