package com.hotong.aiWriteStory.config;

import java.util.ArrayList;

public class ChatGptConfig {

    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";
    public static final String MODEL = "text-davinci-003";
    public static final Integer MAX_TOKEN = 1000;
    public static final Double TEMPERATURE = 0.0;
    public static final Double TOP_P = 1.0;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8";
    public static final String URL = "https://api.openai.com/v1/completions";
}


/**
 * messages: 이 옵션은 모델과의 상호작용을 정의합니다. 대화를 구성하는 메시지 목록을 포함하는 배열로 구성됩니다. 각 메시지는 role (system, user, assistant)과 content (메시지 텍스트)를 가집니다. 대화 컨텍스트를 나타내는 중요한 부분입니다.
 *
 * system: 대화의 흐름을 제어하기 위해 사용되는 시스템 레벨의 메시지를 지정하는 옵션입니다. 예를 들어, "user"와 "assistant" 사이의 역할을 변경하거나 대화의 톤을 설정할 때 유용합니다.
 *
 * temperature: 이 옵션은 출력의 다양성을 조절합니다. 값이 낮을수록 생성된 텍스트가 더 예측 가능하고 일관되며 값이 높을수록 더 다양하고 창의적인 결과가 생성됩니다. 기본값은 1.0입니다.
 *
 * max_tokens: 이 옵션은 생성된 텍스트의 최대 길이를 제한합니다. 모델이 생성하는 텍스트의 토큰 수를 제한하는 데 사용됩니다. 이 값을 적절히 설정하여 긴 텍스트를 생성하지 않도록 할 수 있습니다.
 *
 * stop: 이 옵션은 특정 키워드나 문구가 생성된 텍스트에 나타나면 모델이 더 이상 텍스트를 생성하지 않도록 합니다. 예를 들어, "stop" 옵션을 사용하여 특정 단어가 나타나면 생성을 중단할 수 있습니다.
 *
 * top_p: 이 옵션은 모델이 다음에 나올 가능성이 있는 토큰을 선택할 때 사용되며, 가능한 토큰 중에서 높은 확률을 가진 토큰을 선택합니다. 이 값은 0과 1 사이의 실수여야 하며, 높은 값은 더 보수적인 선택을 의미합니다.
 *
 * frequency_penalty 및 presence_penalty: 이러한 옵션은 모델이 특정 단어나 토큰을 사용하는 경향을 조절합니다. frequency_penalty는 특정 토큰을 더 자주 사용하도록 유도하고, presence_penalty는 특정 토큰을 더 자주 사용하지 않도록 유도합니다.**/
