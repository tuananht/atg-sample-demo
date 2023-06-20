import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-do-you-select-a-label-checkbox-that-contains-an-href'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-do-you-select-a-label-checkbox-that-contains-an-href/11564')

'step 2: Add visual checkpoint at Page_t_how-do-you-select-a-label-checkbox-that-contains-an-href'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01039_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
