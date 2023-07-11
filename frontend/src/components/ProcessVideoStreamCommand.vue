<template>
    <v-card outlined>
        <v-card-title>
            ProcessVideoStream
        </v-card-title>

        <v-card-text>
            <String label="FileName" v-model="value.fileName" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="processVideoStream"
            >
                ProcessVideoStream
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
        name: 'ProcessVideoStreamCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.fileName = '';
        },
        watch: {
        },
        methods: {
            processVideoStream() {
                this.$emit('processVideoStream', this.value);
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

