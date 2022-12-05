package com.baidu.relation;

import com.baidu.Users.*;

public class RelationshipFactory {
	public Relationship getRelationship(String relationship) {
		if(relationship.equalsIgnoreCase("Friend")) {
			return new Friend();
		}else if(relationship.equalsIgnoreCase("Group")) {
			return new Group();
		}
		return null;
	}
}
