<?php
    if($_SERVER['REQUEST_METHOD'] == "GET")
    {
        if(isset($_GET['uuid']))
        {
            $success = true;
            $blacklisted = false;
            #$json_String_FromFile = file_get_contents('dataset_71117_01.aaabdb');
            #$json_Object_71117_01 = json_decode($json_String_FromFile);
            $json_String_FromFile = file_get_contents('dataset_71117_02.aaabdb');
            $json_Object_71117_02 = json_decode($json_String_FromFile);

            #$json_Object_List = array($json_Object_71117_01);
            $json_Object_List = array($json_Object_71117_02);

            $found_usr_obj = null;

            foreach($json_Object_List as $json_Object_List_Item)
            {
                foreach($json_Object_List_Item as $obj)
                {
                    if($obj->UUID == $_GET['uuid'])
                    {
                        $found_usr_obj = $obj;
                        $blacklisted = true;
                        break;
                    }
                }
            }

            if($success && $blacklisted)
            {
                $duid = $found_usr_obj->ID;
                $name = $found_usr_obj->Name;
                $uuid = $found_usr_obj->UUID;

                echo "{\"success\":\"true\", \"blacklisted\":\"true\", \"duid\":\"$duid\", \"name\":\"$name\", \"uuid\":\"$uuid\"}";
                http_response_code(200);
                die();
            }
            echo "{\"success\":\"true\", \"blacklisted\":\"false\"}";
            die();
        }
        echo "{\"success\":\"false\", \"errorMessage\":\"Invalid Parameter count!\"}";
        http_response_code(400);
    } 
    else
    {
        http_response_code(405);
    }
?>