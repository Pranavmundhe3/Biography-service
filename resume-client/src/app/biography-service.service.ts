import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BiographyServiceService {

  biographyServiceBaseURL = "http://localhost:8080";

  constructor(private http:HttpClient) { }

  public getSummaryDetails(){
    return this.http.get(this.biographyServiceBaseURL+"/summary/summary-details");
  }

  public getSkillByType(type){
    return this.http.get(this.biographyServiceBaseURL + "/skill/skill-details/type/" + type);
  }

  public getPersonalDetails(){
    return this.http.get(this.biographyServiceBaseURL+"/personal/personal-details");
  }
  
  public getEducationDetails(){
    return this.http.get(this.biographyServiceBaseURL+"/education/education-details");
  }
  
  public getExperienceDetails(){
    return this.http.get(this.biographyServiceBaseURL+"/experience/experience-details");
  }
  
  public getCertificationList(){
    return this.http.get(this.biographyServiceBaseURL+"/certification/certification-details");
  }
  
}
