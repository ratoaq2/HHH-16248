package org.hibernate.bugs;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("1")
public class ChildA extends ConcreteParentClass {
	
	@JoinColumn(name = "REF_COL", foreignKey = @ForeignKey(name = "FK_REF_00"))
    @ManyToOne
	ConcreteParentClass reference;
}