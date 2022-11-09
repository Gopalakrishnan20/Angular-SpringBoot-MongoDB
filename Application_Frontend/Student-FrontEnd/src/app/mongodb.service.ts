import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Student } from './Model/student.model';

@Injectable({
  providedIn: 'root'
})
export class MongodbService {

  private baseURL="http://localhost:8080/api/students";
  constructor(private http:HttpClient) { }

  public getAllStudents():Observable<any>{
    return this.http.get<any>(`${this.baseURL}`)
  }
}
