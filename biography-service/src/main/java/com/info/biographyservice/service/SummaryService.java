package com.info.biographyservice.service;

import com.info.biographyservice.domain.Summary;
import org.springframework.stereotype.Service;

public interface SummaryService {

    Summary getSummaryDetails();

    Summary saveSummary(Summary summary);

}
