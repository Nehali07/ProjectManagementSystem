package com.anushka.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IssueDTO {
    private Long id;
    
    private String title;
    
    private String description;
    
    private String status;
    
    private Long projectID;
    
    private String priority;
    
    private LocalDate dueDate;
    
    private List<String> tags = new ArrayList<>();
    
    private Project project;
    
    // Exclude assignee during serialization
    
    private User assignee;
}
