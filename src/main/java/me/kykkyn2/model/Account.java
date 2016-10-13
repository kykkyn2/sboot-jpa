package me.kykkyn2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by kykkyn2 on 2016-10-13.
 */
@Data
@Entity
public class Account {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	private String email;

}
