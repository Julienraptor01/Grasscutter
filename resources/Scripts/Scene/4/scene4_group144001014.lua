local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1
L0_1 = {}
L0_1.group_id = 144001014
L1_1 = {}
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L3_1.config_id = 14001
L3_1.gadget_id = 70350224
L4_1 = {}
L4_1.x = 213.553
L4_1.y = 197.125
L4_1.z = 163.828
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 271.98
L4_1.y = 1.072
L4_1.z = 177.739
L3_1.rot = L4_1
L3_1.level = 1
L3_1.area_id = 102
L4_1 = {}
L4_1.config_id = 14002
L4_1.gadget_id = 70350220
L5_1 = {}
L5_1.x = 211.824
L5_1.y = 206.37
L5_1.z = 149.492
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 0.0
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 1
L4_1.area_id = 102
L2_1[1] = L3_1
L2_1[2] = L4_1
L1_1.gadgets = L2_1
L2_1 = {}
L3_1 = {}
L3_1.config_id = 1014003
L3_1.name = "GADGET_STATE_CHANGE_14003"
L4_1 = EventType
L4_1 = L4_1.EVENT_GADGET_STATE_CHANGE
L3_1.event = L4_1
L3_1.source = ""
L3_1.condition = "condition_EVENT_GADGET_STATE_CHANGE_14003"
L3_1.action = "action_EVENT_GADGET_STATE_CHANGE_14003"
L3_1.trigger_count = 0
L4_1 = {}
L4_1.config_id = 1014004
L4_1.name = "GADGET_STATE_CHANGE_14004"
L5_1 = EventType
L5_1 = L5_1.EVENT_GADGET_STATE_CHANGE
L4_1.event = L5_1
L4_1.source = ""
L4_1.condition = "condition_EVENT_GADGET_STATE_CHANGE_14004"
L4_1.action = "action_EVENT_GADGET_STATE_CHANGE_14004"
L4_1.trigger_count = 0
L5_1 = {}
L5_1.config_id = 1014005
L5_1.name = "ANY_GADGET_DIE_14005"
L6_1 = EventType
L6_1 = L6_1.EVENT_ANY_GADGET_DIE
L5_1.event = L6_1
L5_1.source = ""
L5_1.condition = "condition_EVENT_ANY_GADGET_DIE_14005"
L5_1.action = "action_EVENT_ANY_GADGET_DIE_14005"
L2_1[1] = L3_1
L2_1[2] = L4_1
L2_1[3] = L5_1
L1_1.triggers = L2_1
garbages = L1_1
L1_1 = {}
L1_1.suite = 2
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L2_1.monsters = L3_1
L3_1 = {}
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L3_1 = {}
L4_1 = {}
L3_1.monsters = L4_1
L4_1 = {}
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L1_1[1] = L2_1
L1_1[2] = L3_1
suites = L1_1
