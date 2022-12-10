import { Component, OnInit } from '@angular/core';
import { BiographyServiceService } from './../biography-service.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  panelOpenStateTech = false;
  panelOpenStateFrame = false;
  panelOpenStateTool = false;
  panelOpenStateOther = false;
  skillDetails: any;

  constructor(private biographyServiceService: BiographyServiceService) { }

  ngOnInit(): void {
  }

  getSkillsByTech() {
    this.panelOpenStateTech = true;
    this.getSkillsByType("Technologies");
  }

  getSkillsByFramework() {
    this.panelOpenStateFrame = true;
    this.getSkillsByType("Frameworks");
  }

  getSkillsByTools() {
    this.panelOpenStateTool = true;
    this.getSkillsByType("Tools");
  }
  
  getSkillsByOthers() {
    this.panelOpenStateOther = true;
    this.getSkillsByType("Technologies");
  }

  getSkillsByType(type) {
    let skills = this.biographyServiceService.getSkillByType(type);
    skills.subscribe((data) => {
      this.skillDetails = data;
      console.log(this.skillDetails);
    });
  }

}
