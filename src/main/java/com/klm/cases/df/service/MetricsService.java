package com.klm.cases.df.service;

import com.klm.cases.df.model.Fare;
import com.klm.cases.df.model.Location;
import com.klm.cases.df.model.Locations;
import com.klm.cases.df.model.Metrics;

public interface MetricsService {
	public Metrics getHealthMetrics();
}
