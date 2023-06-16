import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_user_license_create_kse'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/user/license/create/kse')

'step 2: At Page_user_license_create_kse click on input_machine_id'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_user_license_create_kse click on button_create_license_key'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_user_license_create_kse click on input_machine_id'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_user_license_create_kse click on div_object'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_user_license_create_kse click on div_object'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_user_license_create_kse click on hyperlink_user_apikey --> navigate to Page_user_apikey'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_user_apikey click on hyperlink_user_license --> navigate to Page_user_license'

testObj = findTestObject('Object Repository/Page_user_license_create_kse/hyperlink_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license/create/kse(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_user_license click on hyperlink_user_apikey --> navigate to Page_user_apikey'

testObj = findTestObject('Object Repository/Page_user_license/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/license(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page_user_apikey click on button_toggle_apikey_visibility --> navigate to Page_home'

testObj = findTestObject('Object Repository/Page_user_apikey/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/apikey(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page_home click on hyperlink_home'

testObj = findTestObject('Object Repository/Page_user_apikey/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/apikey(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page_home click on hyperlink_home'

testObj = findTestObject('Object Repository/Page_user_apikey/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/user/apikey(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 13: At Page_home click on hyperlink_executions --> navigate to Page_executions'

testObj = findTestObject('Object Repository/Page_organization_home/hyperlink_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/organization/.*/home(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page_executions click on hyperlink_test_reports_test_maintenance_active --> navigate to Page_test-reports_test-maintenance_active'

testObj = findTestObject('Object Repository/Page_team_project_executions/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/team/.*/project/.*/executions/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 15: At Page_test-reports_test-maintenance_active click on hyperlink_test_reports_test_maintenance_stale --> navigate to Page_test-reports_test-maintenance_stale'

testObj = findTestObject('Object Repository/Page_team_project_test-reports_test-maintenance_active/hyperlink_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/team/.*/project/.*/test-reports/test-maintenance/active(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 16: At Page_test-reports_test-maintenance_stale click on hyperlink_test_reports_test_maintenance_slowest --> navigate to Page_test-reports_test-maintenance_slowest'

testObj = findTestObject('Object Repository/Page_team_project_test-reports_test-maintenance_stale/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/team/.*/project/.*/test-reports/test-maintenance/stale(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 17: At Page_test-reports_test-maintenance_slowest click on hyperlink_test_reports_test_maintenance_flakiness_ --> navigate to Page_test-reports_test-maintenance_flakiness-report'

testObj = findTestObject('Object Repository/Page_team_project_test-reports_test-maintenance_slowest/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/team/.*/project/.*/test-reports/test-maintenance/slowest(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 18: At Page_test-reports_test-maintenance_flakiness-report click on hyperlink_test_reports_test_maintenance_platform_s --> navigate to Page_test-reports_test-maintenance_platform-statistics'

testObj = findTestObject('Object Repository/Page_team_project_test-reports_test-maintenance_flakiness-report/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/team/.*/project/.*/test-reports/test-maintenance/flakiness-report(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 19: Add visual checkpoint at Page_test-reports_test-maintenance_platform-statistics'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00118_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
