
var menu = new Vue({
    el: '#main',
    data: {
        services: [
                {
                        name: 'Desarrollo web',
                        price: 300,
                        active:true
                },{
                        name: 'Diseño',
                        price: 400,
                        active:false
                },{
                        name: 'Integracion',
                        price: 250,
                        active:false
                },{
                        name: 'Training',
                        price: 220,
                        active:false
                }
        ]
    },
    methods: {
        toggleActive: function(s){
            s.active = !s.active;
        },
        total: function(){

                var total = 0;

                this.services.forEach(function(s){
                        if (s.active){
                                total+= s.price;
                        }
                });

           return total;
        }
    }
});