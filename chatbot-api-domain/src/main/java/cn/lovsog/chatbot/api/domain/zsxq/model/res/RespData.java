package cn.lovsog.chatbot.api.domain.zsxq.model.res;

import cn.lovsog.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @author Lovsog
 * 2023/3/9
 **/
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}