import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_export-report-to-pdf'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/export-report-to-pdf/18833')

'step 2: At Page_t_export-report-to-pdf click on div_object --> navigate to Page_t_export-report-to-1'

testObj = findTestObject('Object Repository/Page_t_export-report-to-pdf/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/export-report-to-pdf/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_export-report-to-1 click on div_object'

testObj = findTestObject('Object Repository/Page_t_export-report-to-pdf/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/export-report-to-pdf/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_t_export-report-to-1'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00020_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
