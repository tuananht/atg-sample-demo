import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-set-value-for-rest-api-query-parameter-in-test-case'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-set-value-for-rest-api-query-parameter-in-test-case/17562')

'step 2: Add visual checkpoint at Page_t_how-can-i-set-value-for-rest-api-query-parameter-in-test-case'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00812_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
