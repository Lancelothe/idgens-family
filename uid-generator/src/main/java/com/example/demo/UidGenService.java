package com.example.demo;

import com.xfvape.uid.UidGenerator;
import com.xfvape.uid.impl.CachedUidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lancelot
 * @date 2020/8/11
 */
@Service
public class UidGenService {

    @Resource
    private UidGenerator uidGenerator;
    /**
     * 获取uid
     * @return
     */
    public long nextId() {
        return uidGenerator.getUID();
    }

    /**
     * 格式化传入的uid，方便查看其实际含义
     * @param uid
     * @return
     */
    public String parse(long uid) {
        return uidGenerator.parseUID(uid);
    }
}