
package com.lkproject.lkproject.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Customer extends Identifiable {
	
	
	@Id
	@Column(length=80)
	int name;

	@Column(length =80)
	@Required
	String login;
	
	@Required
	LocalDate birthday;
	
}