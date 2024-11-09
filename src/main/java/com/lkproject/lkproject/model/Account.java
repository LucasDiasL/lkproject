package com.lkproject.lkproject.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.jpa.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple", members="number, owner")
public class Account extends Identifiable {
    
    @ReadOnly
    int number;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @DescriptionsList 
    Customer owner;
    
    @Stereotype("MONEY")	
    BigDecimal balance;
    
    @PrePersist
    private void calculateNumber() throws Exception {
        String sql = "select max(number) from Account";
        Query query = XPersistence.getManager().createQuery(sql);
        Integer lastNumber = (Integer) query.getSingleResult();
        this.number = (lastNumber == null ? 1 : lastNumber + 1);
    }
}
