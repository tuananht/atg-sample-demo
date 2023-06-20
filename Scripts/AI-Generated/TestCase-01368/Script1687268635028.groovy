import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_call-a-method-until-an-element-becomes-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/call-a-method-until-an-element-becomes-visible/60466/4')

'step 2: Add visual checkpoint at Page_t_call-a-method-until-an-element-becomes-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01368_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
