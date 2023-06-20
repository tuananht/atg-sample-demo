import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_please-remove-unnecessary-disable-extensions-disable-extensions-except-switches-for-chrome-exe'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/please-remove-unnecessary-disable-extensions-disable-extensions-except-switches-for-chrome-exe/10828')

'step 2: Add visual checkpoint at Page_t_please-remove-unnecessary-disable-extensions-disable-extensions-except-switches-for-chrome-exe'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00423_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
