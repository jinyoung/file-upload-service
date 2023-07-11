<template>
    <v-card outlined>
        <v-card-title>
            SendNotification
        </v-card-title>

        <v-card-text>
            <String label="NotificationMessage" v-model="value.notificationMessage" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="sendNotification"
            >
                SendNotification
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SendNotificationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.notificationMessage = '';
        },
        watch: {
        },
        methods: {
            sendNotification() {
                this.$emit('sendNotification', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

