package com.mossle.cms.persistence.manager;

import com.mossle.cms.persistence.domain.CommentInfo;

import com.mossle.core.hibernate.HibernateEntityDao;

import org.springframework.stereotype.Service;

@Service
public class CommentInfoManager extends HibernateEntityDao<CommentInfo> {
}
