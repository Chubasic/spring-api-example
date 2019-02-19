package io.app.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data public class Event {
//	ID annotation for primary key in db
	@Id
	private String id;

	private String name;
	private String location;
	private String description;

}
