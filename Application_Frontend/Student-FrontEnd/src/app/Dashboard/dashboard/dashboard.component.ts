import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/app/Model/student.model';
import { MongodbService } from 'src/app/mongodb.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  students!:Student[];
  
  constructor(private route:Router,private service:MongodbService) { }

  ngOnInit(): void {
    this.getStudents();
  }
  addStudent(){
    this.route.navigate(["/addStudent"])
  }
  updateStudent(){
    this.route.navigate(["/updateStudent"])
  }

  getStudents(){
    this.service.getAllStudents().subscribe(
      data=>{
        this.students=data; 
      },
      error=>{
        console.log("Exception occured");
      }
      
    )
  }

}
