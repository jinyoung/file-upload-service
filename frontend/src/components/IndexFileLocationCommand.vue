<template>
    <v-card outlined>
        <v-card-title>
            IndexFileLocation
        </v-card-title>

        <v-card-text>
            <String label="FileName" v-model="value.fileName" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="indexFileLocation"
            >
                IndexFileLocation
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
        name: 'IndexFileLocationCommand',
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
            indexFileLocation() {
                this.$emit('indexFileLocation', this.value);
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

