
package com.lkproject.lkproject.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Customer extends Identifiable {
	
	
	
	@Column(length=80) @Required
	String name;
	
	@Column(length=80) @Required
	String idade;
	

	@Column(length =80) @Required
	String email;
	
	@Column(length=80) @Required
	String senha;
	
	@Required
	LocalDate birthday;
	
}