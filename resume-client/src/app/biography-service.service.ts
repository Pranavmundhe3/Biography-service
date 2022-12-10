import { Summary } from './entity/Summary';
import { Skill } from './entity/Skill';
import { Education } from './entity/Education';
import { Experience } from './entity/Experience';
import { Certification } from './entity/Certification';
import { Personal } from './entity/Personal';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BiographyServiceService {

  biographyServiceBaseURL = "http://localhost:8080";

  constructor(private http:HttpClient) { }

  public getSummaryDetails() : Observable<Summary>{
    return this.http.get<Summary>(this.biographyServiceBaseURL+"/summary/summary-details");
  }

  public getSkillByType(type):Observable<Skill>{
    return this.http.get<Skill>(this.biographyServiceBaseURL + "/skill/skill-details/type/" + type);
  }

  public getPersonalDetails(): Observable<Personal>{
    return this.http.get<Personal>(this.biographyServiceBaseURL+"/personal/personal-details");
  }
  
  public getEducationDetails() : Observable<Education>{
    return this.http.get<Education>(this.biographyServiceBaseURL+"/education/education-details");
  }
  
  public getExperienceDetails(): Observable<Experience> {
    return this.http.get<Experience>(this.biographyServiceBaseURL+"/experience/experience-details");
  }
  
  public getCertificationList() : Observable<Certification[]>{
    return this.http.get<Certification[]>(this.biographyServiceBaseURL+"/certification/certification-details");
  }
  
}
