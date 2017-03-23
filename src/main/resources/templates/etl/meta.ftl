<!DOCTYPE html>
<html>
<head>
    <link href="/css/plugins/dataTables/datatables.min.css" rel="stylesheet">
</head>
<body>
    <#--主显示区域-->
    <div class="wrapper wrapper-content animated fadeIn">
            <div class="row">
                <div class="col-lg-12">
                    <div class="tabs-container">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#tab-1">kafka配置</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-2">zookeeper配置</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-2">短信告警服务器配置</a></li>
                        </ul>
                        <div class="tab-content">
                            <div id="tab-1" class="tab-pane active">
                                <div class="panel-body">
                                    <div class="col-lg-12">
                                        <#--kafka查询列表-->
                                        <div class="ibox float-e-margins">
                                            <div class="ibox-title">
                                                <h5>Kafka-Server列表</h5>
                                                <div class="ibox-tools">
                                                    <a class="collapse-link">
                                                        <i class="fa fa-chevron-up"></i>
                                                    </a>
                                                    <a href="javascript:void(0);" onclick="addKafka()">
                                                        <i class="fa fa-plus"></i>
                                                    </a>
                                                    <a class="close-link">
                                                        <i class="fa fa-times"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="ibox-content">
                                                <div class="table-responsive">
                                                    <table class="table table-striped table-bordered table-hover dataTables-example" >
                                                        <thead>
                                                        <tr>
                                                            <th>kafka名称</th>
                                                            <th>brokers</th>
                                                            <th>创建时间</th>
                                                            <th>更新时间</th>
                                                            <th>操作</th>
                                                        </tr>
                                                        </thead>
                                                        <tbody>
                                                        <tr>
                                                            <td>正式Kafka1</td>
                                                            <td style="">kfk1.sys.bj2.yongche.com:9092</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td><a href="#"><i class="fa fa-pencil-square-o"></i>|<i class="fa fa-trash-o"></i></a></td>
                                                        </tr>
                                                        <tr>
                                                            <td>正式Kafka2</td>
                                                            <td style="">kfk1.sys.bj2.yongche.com:9092</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td><a href="#"><i class="fa fa-pencil-square-o"></i>|<i class="fa fa-trash-o"></i></a></td>
                                                        </tr>
                                                        <tr>
                                                            <td>正式Kafka3</td>
                                                            <td style="">kfk1.sys.bj2.yongche.com:9092</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td>2016-12-20 10:00:00</td>
                                                            <td><a href="#"><i class="fa fa-pencil-square-o"></i>|<i class="fa fa-trash-o"></i></td>
                                                        </tr>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                        </div>
                                        <#--增加kafka-->
                                        <div id="add-kafka" style="display: none" class="ibox float-e-margins">
                                            <div class="ibox-title">
                                                <h5>添加kafka信息</h5>
                                                <div class="ibox-tools">
                                                    <a class="collapse-link">
                                                        <i class="fa fa-chevron-up"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="ibox-content">
                                                <form method="get" class="form-horizontal">
                                                    <div class="form-group"><label class="col-sm-2 control-label">kafka名称</label>
                                                        <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                    </div>
                                                    <div class="hr-line-dashed"></div>
                                                    <div class="form-group"><label class="col-sm-2 control-label">brokers</label>
                                                        <div class="col-sm-10">
                                                            <textarea class="form-control"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="hr-line-dashed"></div>
                                                    <div class="form-group">
                                                        <div class="col-sm-4 col-sm-offset-6">
                                                            <button class="btn btn-white" type="submit" onclick="cancelAddKafka()">取消</button>
                                                            <button class="btn btn-primary" type="submit">保存</button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="tab-2" class="tab-pane">
                                <div class="panel-body">
                                    <strong>Donec quam felis</strong>

                                    <p>Thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects
                                        and flies, then I feel the presence of the Almighty, who formed us in his own image, and the breath </p>

                                    <p>I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite
                                        sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <script src="/js/plugins/dataTables/datatables.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.dataTables-example').DataTable({
                pageLength: 25,
                responsive: true,
                dom: '<"html5buttons"B>lTfgitp',
                buttons: [
                    { extend: 'copy'},
                    {extend: 'csv'},
                    {extend: 'excel', title: 'ExampleFile'},
                    {extend: 'pdf', title: 'ExampleFile'},

                    {extend: 'print',
                        customize: function (win){
                            $(win.document.body).addClass('white-bg');
                            $(win.document.body).css('font-size', '10px');
                            $(win.document.body).find('table')
                                    .addClass('compact')
                                    .css('font-size', 'inherit');
                        }
                    }
                ]
            });
        });
        function addKafka() {
            $("#add-kafka").css("display","block");
        }
        function cancelAddKafka() {
            $("#add-kafka").css("display","none");
        }
    </script>
</body>
</html>
