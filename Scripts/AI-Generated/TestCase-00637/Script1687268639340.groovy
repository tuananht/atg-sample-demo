import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_where-does-webui-takescreenshot-actually-save-the-screenshot'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/where-does-webui-takescreenshot-actually-save-the-screenshot/6535')

'step 2: Add visual checkpoint at Page_t_where-does-webui-takescreenshot-actually-save-the-screenshot'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00637_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
