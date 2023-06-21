import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_session3-katalon-mobile-automation-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/session3-katalon-mobile-automation-testing')

'step 2: Add visual checkpoint at Page_webinars_session3-katalon-mobile-automation-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00027_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
