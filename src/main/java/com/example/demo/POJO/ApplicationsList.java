package com.example.demo.POJO;

import java.util.List;

import com.example.demo.Entity.Applications;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ApplicationsList {
	private List<Applications> applicationList;

}
