package com.org.panthers.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.ws.rs.core.UriInfo;

import com.org.panthers.framework.busBaseDAOImpl;
import com.org.panthers.framework.doBase;

import java.util.Date;


/**
 * The persistent class for the TRAN_QUESTION_HISTORY database table.
 * 
 */
@Entity
@Table(name="TRAN_QUESTION_HISTORY")
@NamedQuery(name="doQuestionHistory.findAll", query="SELECT d FROM doQuestionHistory d")
public class doQuestionHistory extends doBase implements Serializable {
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_HISTORY_ID")
	public int questionHistoryId;

	@Column(name="ACTION_TYPE_ID")
	public int actionTypeId;

	@Column(name="ACTION_TYPE_VALUE")
	public String actionTypeValue;

	@Column(name="CREATED_BY")
	public int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	public Date createdDate;

	@Column(name="MODIFIED_BY")
	public int modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_DATE")
	public Date modifiedDate;

	@Column(name="QUESTION_ID")
	public int questionId;

	@Column(name="UPDATE_SEQ")
	public int updateSeq;

	@Column(name="USER_ID")
	public int userId;

	public doQuestionHistory() {
	}

	public int getQuestionHistoryId() {
		return this.questionHistoryId;
	}

	public void setQuestionHistoryId(int questionHistoryId) {
		this.questionHistoryId = questionHistoryId;
	}

	public int getActionTypeId() {
		return this.actionTypeId;
	}

	public void setActionTypeId(int actionTypeId) {
		this.actionTypeId = actionTypeId;
	}

	public String getActionTypeValue() {
		return this.actionTypeValue;
	}

	public void setActionTypeValue(String actionTypeValue) {
		this.actionTypeValue = actionTypeValue;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getUpdateSeq() {
		return this.updateSeq;
	}

	public void setUpdateSeq(int updateSeq) {
		this.updateSeq = updateSeq;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public int insert() {
		busBaseDAOImpl<doQuestionHistory> baseDAOImpl = new busBaseDAOImpl<doQuestionHistory>();
		this.loadCreatedByProperties();
		baseDAOImpl.insert(this);
		return this.getQuestionHistoryId();
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		busBaseDAOImpl<doQuestionHistory> baseDAOImpl = new busBaseDAOImpl<doQuestionHistory>();
		baseDAOImpl.delete(doQuestionHistory.class, this.getQuestionHistoryId());
		return 1;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		busBaseDAOImpl<doQuestionHistory> baseDAOImpl = new busBaseDAOImpl<doQuestionHistory>();
		this.loadModifiedByProperties();
		baseDAOImpl.update(this);
		return 1;
	}

	@Override
	public doQuestionHistory get() {
		// TODO Auto-generated method stub
		busBaseDAOImpl<doQuestionHistory> baseDAOImpl = new busBaseDAOImpl<doQuestionHistory>();
		return baseDAOImpl.get(this.getQuestionHistoryId(), doQuestionHistory.class);
	}

	@Override
	public void loadCreatedByProperties() {
		// TODO Auto-generated method stub
		this.setCreatedBy(this.iintUserId);
		this.setCreatedDate(new Date());
		this.setModifiedBy(this.iintUserId);		
		this.setModifiedDate(new Date());
	}

	@Override
	public void loadModifiedByProperties() {
		// TODO Auto-generated method stub
		this.setModifiedBy(this.iintUserId);		
		this.setModifiedDate(new Date());
	}

	

	public enum enmQuestionHistory {
	
		questionHistoryId,
		actionTypeId,
		actionTypeValue,
		createdBy,
		createdDate,
		modifiedBy,
		modifiedDate,
		questionId,
		updateSeq,
		userId
	}
}
