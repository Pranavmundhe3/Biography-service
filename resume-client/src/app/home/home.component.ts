import { BiographyServiceService } from './../biography-service.service';
import { Summary } from './../entity/Summary';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  summaryDetails: any;
  summaryInfo: string;

  constructor(private biographyServiceService: BiographyServiceService) { }

  ngOnInit(): void {
    this.getSummaryDetails();
  }

  getSummaryDetails() {
    let summary = this.biographyServiceService.getSummaryDetails();
    summary.subscribe((data) => {
      this.summaryDetails = data;
      console.log(this.summaryDetails);
    });
  }

}
