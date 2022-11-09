import { Time } from "@angular/common";
import { Address } from "./address";
import { Gender } from "./gender";

export class Student {
    id!: String;
    firstName!:String;
    lastName!:String;
    email!:String;
    gender!: Gender;
    address!:Address;
    favouriteSubjects!:String[];
    totalSpentInBooks!:number;
    created!:String;
}
