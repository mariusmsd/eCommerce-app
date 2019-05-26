package com.shop.domain;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private long Id;
	
	private String username;
	
	private String password;

}
