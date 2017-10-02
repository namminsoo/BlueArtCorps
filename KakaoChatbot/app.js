'use strict'

let express = require('express');
let app = express();

let bodyParser = require('body-parser');

// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({
    extended: false
}))

// parse application/json
app.use(bodyParser.json())

let friends = ['김동주', '김영진', '김홍모', '권도엽', '고주현', '남민수', '안다영', '이현탁', '임지웅', '오준기', '조국원']
let menu_buttons = friends.slice();
menu_buttons.push('잔액확인', '테스또')



app.get('/keyboard', (req, res) => {

    res.status(200)
        .type('application/json')
        .json({
            type: 'buttons',
            buttons: menu_buttons
        });

});


app.post('/message', (req, res) => {

    console.log(req.body);

    let type = req.body.type;
    let content = req.body.content;
    let message = '1';

    //TODO 구글 시트에서 이름이랑 매칭되게 정보가져오기


    if (type == 'text') {
        if (friends.indexOf(content) > -1) {
            console.log(content + '라는 친구를 누름');
            //TODO 구글 시트에서 이름이랑 매칭되게 정보가져오기
        } else if (menu_buttons.indexOf(content) > -1) {
            console.log(content + ' 누름');
        } else {
          //TODO 좋은 API 있으면 사용해보기. 심심이 같은 API
            message = '뭐라는 거야'
        }
    } else if (type == 'photo') {
        message = '왜 사진을 보내고 그래...'
    } else {
        message = '오류우~'
    }

    res.status(200)
        .type('application/json')
        .json({
            message: {
                text: message
            },
            keyboard: {
                type: 'buttons',
                buttons: menu_buttons
            }
        });

});

app.listen(3000, () => {
    console.log('Conneted 3000 port');
});
