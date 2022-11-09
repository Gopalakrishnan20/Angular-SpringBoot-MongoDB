import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DashboardComponent } from './Dashboard/dashboard/dashboard.component';
import { UpdateStudentComponent } from './update-student/update-student.component';

const routes: Routes = [

{
  path: "addStudent",
  component:AddComponent,
},
{
  path: "updateStudent",
  component: UpdateStudentComponent,
},
{
  path: "dashboard",
  component: DashboardComponent,
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
